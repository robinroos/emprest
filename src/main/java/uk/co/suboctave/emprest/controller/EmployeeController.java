package uk.co.suboctave.emprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.co.suboctave.emprest.domain.Employee;
import uk.co.suboctave.emprest.service.GroupingService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

//@Slf4j
@RestController
@RequestMapping(value = "/emp")
public class EmployeeController {

    protected GroupingService groupingService;

    @Autowired
    public EmployeeController(GroupingService groupingService) {
        this.groupingService = groupingService;
    }

    @PostMapping(value = "/group")
    public Map group(@RequestParam("emplist") List<Employee> empList) {
        return groupingService.group(empList);
    }

}

