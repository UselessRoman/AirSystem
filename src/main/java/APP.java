import com.wjc.config.SpringConfig;
import com.wjc.domain.Company;
import com.wjc.domain.Customer;
import com.wjc.domain.Flight;
import com.wjc.domain.Ticket;
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


        System.out.println("功能1：统计航班数量：" + flightService.count());

        System.out.println("功能2：查询旅客“李慧娟”所有的购票信息:");
        List<Customer> customers2 = customerService.searchAllInformationByName("李慧娟");
        for (Customer c :
                customers2) {
            System.out.println(c);
        }

        System.out.println("功能3：统计各航班的乘客人数和机票销售额，按照乘客人数和机票销售额升序显示：");
        List<Flight> flights3 = flightService.findPassengerNumAndTotalSale();
        for (Flight f :
                flights3) {
            System.out.println(f);
        }

        System.out.println("功能4：查询由北京出发的所有航班信息：");
        List<Flight> flights4 = flightService.findByStartCity("北京");
        for (Flight f :
                flights4) {
            System.out.println(f);
        }

        System.out.println("功能5：查询飞往上海的航班数:" + flightService.countByDestination("上海") +
                ",最长航线里程数：" + flightService.findMaxDistanceByDestination("上海") +
                ",最短航线里程数：" + flightService.findMinDistanceByDestination("上海") +
                ",平均航线里程数：" + flightService.findAverageDistanceByDestination("上海") +
                ",航线总里程数：" + flightService.findTotalDistanceByDestination("上海"));


        System.out.println("功能6：统计每一家航空公司的平均航线里程数：");
        List<Company> companies6 = companyService.findAverageDistance();
        for (Company c :
                companies6) {
            System.out.println(c);
        }

        System.out.println("功能7：按航空公司显示所属航线的平均里程数大于800公里的分组信息：");
        List<Company> companies7 = companyService.findAverageDistanceMoreThan(800);
        for (Company c :
                companies7) {
            System.out.println(c);
        }

        System.out.println("功能8：统计每一家航空公司所属航线的乘客总人数和机票销售总额，按乘客数、机票销售总额升序显示：");
        List<Company> companies8 = companyService.findTotalPassengerAndTotalSale();
        for (Company c :
                companies8) {
            System.out.println(c);
        }

        System.out.println("功能9：查询使用大陆居民身份证购买到北京的机票的乘客：");
        List<Customer> customers9 =
                customerService.findByMainlandIDAndDestination("北京");
        for (Customer customer : customers9
        ) {
            System.out.println(customer);
        }

        System.out.println("功能10：查询北京发往上海折扣价格最低的航班:" + "\n" + flightService.findCheapestByStartAndDestination("北京", "上海"));


        System.out.println("功能11：查询每一家航空公司的总里程数：");
        List<Company> companies11 = companyService.findTotalDistance();
        for (Company c :
                companies11) {
            System.out.println(c);
        }

        System.out.println("功能12：查询武汉飞往北京的飞机的航班号、机型、里程数、起飞时间，并按照起飞时间排序:");
        List<Flight> flights12 = flightService.findByStartAndDestination("武汉", "北京");
        for (Flight f :
                flights12) {
            System.out.println(f);
        }

        System.out.println("功能13：查询飞往上海的所有航班信息:");
        List<Flight> flights13 = flightService.findByDestinationCity("上海");
        for (Flight f :
                flights13) {
            System.out.println(f);
        }

        System.out.println("功能14：查询价格小于300元的机票：");
        List<Ticket> tickets = ticketService.findByPriceLessThan(300);
        for (Ticket t :
                tickets) {
            System.out.println(t);
        }
    }
}
