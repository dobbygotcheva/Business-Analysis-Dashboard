package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller to handle redirects from root URL to the main index page
 */
@Controller
public class RedirectController {

    private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);

    /**
     * Redirects requests from the root URL to the main index page
     * @return RedirectView to the index page
     */
    @GetMapping("/")
    public RedirectView redirectToIndex() {
        logger.debug("Redirecting from root URL to /index.xhtml");
        return new RedirectView("/index.xhtml");
    }
}
