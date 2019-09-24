package com.vote.demo.servcie;

import com.vote.demo.entity.PigBoy;
import com.vote.demo.mapper.PigBoyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: mytest
 * @author: lwh
 * @create: 2019-09-23 09:59
 */
@Service
public class PigBoyService {
    @Autowired(required = false)
    private PigBoyMapper pigBoyMapper;

    public List<PigBoy> findAll(){
        return pigBoyMapper.selectAll();
    }
}
