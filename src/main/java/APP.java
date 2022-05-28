import com.wjc.config.SpringConfig;
import com.wjc.domain.Company;
import com.wjc.domain.Customer;
import com.wjc.domain.Flight;
import com.wjc.service.CompanyService;
import com.wjc.service.CustomerService;
import com.wjc.service.FlightService;
import com.wjc.service.TicketService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class APP {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        CustomerService customerService = ctx.getBean(CustomerService.class);

        CompanyService companyService = ctx.getBean(CompanyService.class);

        FlightService flightService = ctx.getBean(FlightService.class);

        TicketService ticketService = ctx.getBean(TicketService.class);

//        List<Flight> flights = flightService.findPassengerNumAndTotalSale();
//        for (Flight flight: flights
//             ) {
//            System.out.println(flight);
//        }


    }
}
