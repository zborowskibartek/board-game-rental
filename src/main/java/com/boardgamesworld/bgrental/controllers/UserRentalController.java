package com.boardgamesworld.bgrental.controllers;

import com.boardgamesworld.bgrental.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRentalController {

    private RentService userRentalService;

    @Autowired
    public UserRentalController(RentService userRentalService) {
        this.userRentalService = userRentalService;
    }

  /*  @PostMapping("/rent")
    public void rentBoardGame(@RequestParam long userId, @RequestParam long boardGameId) {
        userRentalService.rentBoardGame(userId, boardGameId);
    }

    @PostMapping("/return")
    public void returnBoardGame(@RequestParam long userId, @RequestParam long boardGameId) {
        userRentalService.returnBoardGame(userId, boardGameId);
    }*/
}
