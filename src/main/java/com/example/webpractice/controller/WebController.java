package com.example.webpractice.controller;

import com.example.webpractice.model.Board;
import com.example.webpractice.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/")
    public String index (){

        return "index";
    }

    @GetMapping("/boardlist")
    public String boardList(Model model){

        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards",boards);

        return "boardlist";
    }


}
