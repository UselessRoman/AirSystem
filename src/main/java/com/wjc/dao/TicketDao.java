package com.wjc.dao;


import com.wjc.domain.Ticket;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketDao
{
    @Select("select * from ticket where Ticket.price< #{price}")
    List<Ticket> findByPriceLessThan(int price);
}
