const express = require('express');
const { createProxyMiddleware } = require('http-proxy-middleware');
const app = express();
const port = process.env.PORT || 8081;

// Proxy all requests to the Spring Boot application
app.use('/', createProxyMiddleware({
    target: 'http://localhost:8080',
    changeOrigin: true,
    pathRewrite: {
        '^/': '/'
    }
}));

app.listen(port, () => {
    console.log(`Proxy server is running on port ${port}`);
}); 