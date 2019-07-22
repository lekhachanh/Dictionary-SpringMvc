package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/translate")
    public String translate(@RequestParam String word, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("one", "một");
        dictionary.put("two", "hai");
        dictionary.put("three", "ba");
        dictionary.put("four", "bốn");
        dictionary.put("five", "năm");
        dictionary.put("six", "sáu");
        String search = dictionary.get(word);
        if (search != null) {
            model.addAttribute("word", word);
            model.addAttribute("search", search);
        } else {
            search = "Not Found";
            model.addAttribute("word", word);
            model.addAttribute("search", search);
        }
        return "dictionary";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
