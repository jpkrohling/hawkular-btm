/*
 * Copyright 2015-2017 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.apm.api.model.config.txn;

import org.hawkular.apm.api.model.PropertyType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * This class represents the action of setting a property.
 *
 * @author gbrown
 */
public class SetPropertyAction extends ExpressionBasedAction {

    @JsonInclude(Include.NON_NULL)
    private String name;

    @JsonInclude(Include.NON_DEFAULT)
    private PropertyType type = PropertyType.Text;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public PropertyType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(PropertyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SetPropertyAction [name=" + name + ", type=" + type + ", getExpression()=" + getExpression()
                + ", getDescription()=" + getDescription() + ", getPredicate()=" + getPredicate() + "]";
    }

}
