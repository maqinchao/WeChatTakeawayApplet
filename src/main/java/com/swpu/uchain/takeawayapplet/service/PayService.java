package com.swpu.uchain.takeawayapplet.service;

import com.swpu.uchain.takeawayapplet.VO.ResultVO;
import com.swpu.uchain.takeawayapplet.dto.OrderDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface PayService {

    ResultVO creat(OrderDTO orderDTO, HttpServletRequest request);

    ResultVO notify(Long orderId,HttpServletRequest request, HttpServletResponse response) throws IOException, Exception;

    void refund(OrderDTO orderDTO);

}