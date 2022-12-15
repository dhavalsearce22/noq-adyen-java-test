/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.service.resource.recurring;

import java.util.Arrays;
import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.resource.Resource;

public class Disable extends Resource {
    public Disable(Service service) {
        super(service,
              service.getClient().getConfig().getEndpoint() + "/pal/servlet/Recurring/" + Client.RECURRING_API_VERSION + "/disable",
              Arrays.asList("merchantAccount", "shopperReference", "recurringDetailReference"));
    }
}
