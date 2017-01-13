/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.infrastructure.persistence.aws.dynamodb;

import com.clicktravel.cheddar.infrastructure.persistence.database.Item;

public class StubWithHashAndRangeAndGlobalSecondaryIndexItem implements Item {

    private String id;
    private Integer range;
    private Integer gsiSupportingValue;
    private Long version;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(final Integer range) {
        this.range = range;
    }

    public Integer getGsiSupportingValue() {
        return gsiSupportingValue;
    }

    public void setGsiSupportingValue(final Integer gsiSupportingValue) {
        this.gsiSupportingValue = gsiSupportingValue;
    }

    @Override
    public Long getVersion() {
        return version;
    }

    @Override
    public void setVersion(final Long version) {
        this.version = version;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gsiSupportingValue == null) ? 0 : gsiSupportingValue.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((range == null) ? 0 : range.hashCode());
        result = prime * result + ((version == null) ? 0 : version.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StubWithHashAndRangeAndGlobalSecondaryIndexItem other = (StubWithHashAndRangeAndGlobalSecondaryIndexItem) obj;
        if (gsiSupportingValue == null) {
            if (other.gsiSupportingValue != null) {
                return false;
            }
        } else if (!gsiSupportingValue.equals(other.gsiSupportingValue)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        if (range == null) {
            if (other.range != null) {
                return false;
            }
        } else if (!range.equals(other.range)) {
            return false;
        }
        if (version == null) {
            if (other.version != null) {
                return false;
            }
        } else if (!version.equals(other.version)) {
            return false;
        }
        return true;
    }
}
