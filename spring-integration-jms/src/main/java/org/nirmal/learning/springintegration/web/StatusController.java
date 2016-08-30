package org.nirmal.learning.springintegration.web;

import org.nirmal.learning.springintegration.model.ServiceStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class StatusController
{
    @RequestMapping( value = "/status", method = RequestMethod.GET )
    @ResponseBody
    public ServiceStatus getStatus()
    {
        return new ServiceStatus( ServiceStatus.StatusType.OK, "1.0-SNAPSHOT" );
    }
}
