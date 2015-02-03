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
package com.clicktravel.cheddar.infrastructure.persistence.database.query;

public class AttributeQuery extends AbstractQuery {

    private final String attributeName;

    public AttributeQuery(final String attributeName, final Condition condition) {
        super(condition);
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    @Override
    public String toString() {
        return "AttributeQuery [attributeName=" + attributeName + ", condition=" + getCondition() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (attributeName == null ? 0 : attributeName.hashCode());
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
        final AttributeQuery other = (AttributeQuery) obj;
        if (attributeName == null) {
            if (other.attributeName != null) {
                return false;
            }
        } else if (!attributeName.equals(other.attributeName)) {
            return false;
        }
        return true;
    }

}
