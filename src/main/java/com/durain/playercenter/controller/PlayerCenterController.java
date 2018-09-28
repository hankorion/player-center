package com.durain.playercenter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerCenterController {

	@GetMapping(value = "/playercenter/players", produces = { "application/json;charset=UTF-8" })
	public List<String> getPlayers() {
		List<String> playerList = new ArrayList<>();
		playerList.add("zg");
		playerList.add("kw");
		return playerList;
	}

}
