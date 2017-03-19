package org.runnerisland.http;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/rels/tasks")
public class MyTaskRestController {

    @RequestMapping(path = "/me")
    protected void listMyTasks() {

    }
}
