package com.vodacom.dummy.secondms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyAPI {
    @RequestMapping("/dummyReq")
    public String dummyReq()
    {
        return "Hello Akash";
    }
}
