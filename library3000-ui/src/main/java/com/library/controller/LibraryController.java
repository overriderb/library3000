package com.library.controller;

import com.library.model.LibraryModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO: Add class description
 * <p/>
 * User: override
 * Date: 03.11.13
 * Time: 2:22
 */
@Controller
public class LibraryController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addLibrary(@ModelAttribute("library")LibraryModel libraryModel) {
        return "redirect:/index";
    }

}
