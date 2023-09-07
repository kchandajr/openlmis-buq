/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2017 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details. You should have received a copy of
 * the GNU Affero General Public License along with this program. If not, see
 * http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org.
 */

package org.openlmis.buq.builder;

import java.util.UUID;
import org.openlmis.buq.domain.buq.BottomUpQuantification;
import org.openlmis.buq.domain.buq.BottomUpQuantificationFundingDetails;

public class BottomUpQuantificationFundingDetailsDataBuilder {

  private UUID id = UUID.randomUUID();
  private BottomUpQuantification bottomUpQuantification =
      new BottomUpQuantificationDataBuilder().buildAsNew();
  private Long totalProjectedFund = 1000L;
  private Long totalForecastedCost = 800L;
  private Long gap = 200L;

  /**
   * Creates new instance of {@link BottomUpQuantificationFundingDetails}.
   */
  public BottomUpQuantificationFundingDetails build() {
    BottomUpQuantificationFundingDetails buqFundingDetails = buildAsNew();
    buqFundingDetails.setId(id);

    return buqFundingDetails;
  }

  /**
   * Creates new instance of {@link BottomUpQuantificationFundingDetails} dedicated to repository
   * usage.
   */
  public BottomUpQuantificationFundingDetails buildAsNew() {
    return new BottomUpQuantificationFundingDetails(
        bottomUpQuantification, totalProjectedFund, totalForecastedCost, gap
    );
  }

  public BottomUpQuantificationFundingDetailsDataBuilder withId(UUID id) {
    this.id = id;
    return this;
  }

  public BottomUpQuantificationFundingDetailsDataBuilder withTotalProjectedFund(
      Long totalProjectedFund) {
    this.totalProjectedFund = totalProjectedFund;
    return this;
  }

  public BottomUpQuantificationFundingDetailsDataBuilder withTotalForecastedCost(
      Long totalForecastedCost) {
    this.totalForecastedCost = totalForecastedCost;
    return this;
  }

  public BottomUpQuantificationFundingDetailsDataBuilder withGap(Long gap) {
    this.gap = gap;
    return this;
  }

}
