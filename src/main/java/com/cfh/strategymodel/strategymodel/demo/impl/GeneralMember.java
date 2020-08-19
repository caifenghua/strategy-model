/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2020.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording,
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 *
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2020-08-19             cai.fenghua   Create the class
 * http://www.jimilab.com/
 */


package com.cfh.strategymodel.strategymodel.demo.impl;

import com.cfh.strategymodel.strategymodel.demo.Strategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 实现类A
 *
 * @author cai.fenghua
 * @date 2020-08-19
 * @since 1.0.0
 */
@Service("generalMember")
public class GeneralMember implements Strategy {
    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal("100");
    }
}
