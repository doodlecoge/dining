package com.hch.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: hch
 * Date: 13-8-17
 * Time: 下午11:29
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/t")
public class TimeAction {
    @RequestMapping(method = RequestMethod.GET)
    public String time(ModelMap map) {
        map.put("time", Calendar.getInstance().getTimeInMillis());
        return "time";
    }
}
