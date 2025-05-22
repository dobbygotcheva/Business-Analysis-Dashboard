const express = require('express');
const { createProxyMiddleware } = require('http-proxy-middleware');
const app = express();
const port = process.env.PORT || 8081;
const targetPort = process.env.SERVER_PORT || 8080;

// Add error handling middleware
app.use((err, req, res, next) => {
    console.error('Proxy error:', err);
    res.status(500).send('Proxy error: ' + err.message);
});

// Proxy all requests to the Spring Boot application
app.use('/', createProxyMiddleware({
    target: `http://localhost:${targetPort}`,
    changeOrigin: true,
    pathRewrite: {
        '^/': '/'
    },
    onError: (err, req, res) => {
        console.error('Proxy error:', err);
        res.status(500).send('Proxy error: ' + err.message);
    },
    onProxyReq: (proxyReq, req, res) => {
        console.log(`Proxying request to: ${proxyReq.path}`);
    }
}));

// Health check endpoint
app.get('/health', (req, res) => {
    res.status(200).send('OK');
});

app.listen(port, () => {
    console.log(`Proxy server is running on port ${port}`);
    console.log(`Proxying requests to: http://localhost:${targetPort}`);
}); 