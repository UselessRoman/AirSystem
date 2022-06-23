package com.wjc.service.impl;

import com.wjc.dao.TicketDao;
import com.wjc.domain.Ticket;
import com.wjc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketDao ticketDao;

    @Override
    public List<Ticket> findByPriceLessThan(int price) {
        return ticketDao.findByPriceLessThan(price);
    }
}
