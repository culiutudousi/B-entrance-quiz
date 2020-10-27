package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/group", produces = MediaType.APPLICATION_JSON_VALUE)
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping
    public List<Integer> getGroups() {
        return groupService.getGroups();
    }

    @PostMapping
    public List<Integer> redistributeGroup() {
        groupService.redistributeGroup();
        return groupService.getGroups();
    }
}
