package com.wjc.dao;


import com.wjc.domain.Ticket;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketDao
{

    //查出价格小于某价格的机票
    @Select("select * from ticket where Ticket.price< #{price}")
    List<Ticket> findByPriceLessThan(int price);
}
