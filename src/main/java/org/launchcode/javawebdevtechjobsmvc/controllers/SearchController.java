package org.launchcode.javawebdevtechjobsmvc.controllers;
import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.launchcode.javawebdevtechjobsmvc.controllers.ListController.columnChoices;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
}
//    @PostMapping(value ="results")
//    public String results(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {
//        model.addAttribute ( "title", "my title");
//        if (searchType.equals("all")){
//          JobData.findAll();
//
//        } else {
//            jobs = JobData.findByColumnAndValue(column, value);
//            model.addAttribute("title", "Jobs with " + columnChoices.get(column) + ": " + value);
//        }
//        return "list-jobs";
//    }
    // TODO #3 - Create a handler to process a search request and render the updated search view.

}
