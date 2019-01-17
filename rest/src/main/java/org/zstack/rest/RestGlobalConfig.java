package org.zstack.rest;

import org.zstack.core.config.GlobalConfig;
import org.zstack.core.config.GlobalConfigDefinition;
import org.zstack.core.config.GlobalConfigValidation;

/**
 * Created by xing5 on 2016/12/9.
 */
@GlobalConfigDefinition
public class RestGlobalConfig {
    public static final String CATEGORY = "rest";

    @GlobalConfigValidation
    public static GlobalConfig COMPLETED_API_EXPIRED_PERIOD = new GlobalConfig(CATEGORY, "completedApi.expiredPeriod");
    @GlobalConfigValidation(numberGreaterThan = 1)
    public static GlobalConfig SCAN_EXPIRED_API_INTERVAL = new GlobalConfig(CATEGORY, "expiredApi.scanInterval");

    @GlobalConfigValidation(validValues = {"true", "false"})
    public static GlobalConfig ENABLE_USER_CONNECTION_IP_WHITELIST = new GlobalConfig(CATEGORY, "enable.user.connection.ip.whitelist");

    @GlobalConfigValidation
    public static GlobalConfig USER_CONNECTION_IP_WHITELIST = new GlobalConfig(CATEGORY, "user.connection.ip.whitelist");
}
