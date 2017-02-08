/*
 *  Copyright 2016-present Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.compare;

import java.time.LocalDate;
import java.util.Set;

import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.light.LightMetaBean;

@BeanDefinition(style = "light", factoryName = "of")
public final class JodaBeansLightPerson implements ImmutableBean {
  // NOTES
  // Requires runtime dependency on Joda-Beans
  // block generated within the class

  /**
   * The name of the person.
   */
  @PropertyDefinition(validate = "notNull")
  private final String name;

  /**
   * The date of birth.
   */
  @PropertyDefinition(validate = "notNull")
  private final LocalDate birthDate;

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code JodaBeansLightPerson}.
   */
  private static final MetaBean META_BEAN = LightMetaBean.of(JodaBeansLightPerson.class);

  /**
   * The meta-bean for {@code JodaBeansLightPerson}.
   * @return the meta-bean, not null
   */
  public static MetaBean meta() {
    return META_BEAN;
  }

  static {
    JodaBeanUtils.registerMetaBean(META_BEAN);
  }

  /**
   * Obtains an instance.
   * @param name  the value of the property, not null
   * @param birthDate  the value of the property, not null
   * @return the instance
   */
  public static JodaBeansLightPerson of(
      String name,
      LocalDate birthDate) {
    return new JodaBeansLightPerson(
      name,
      birthDate);
  }

  private JodaBeansLightPerson(
      String name,
      LocalDate birthDate) {
    JodaBeanUtils.notNull(name, "name");
    JodaBeanUtils.notNull(birthDate, "birthDate");
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public MetaBean metaBean() {
    return META_BEAN;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the name of the person.
   * @return the value of the property, not null
   */
  public String getName() {
    return name;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the date of birth.
   * @return the value of the property, not null
   */
  public LocalDate getBirthDate() {
    return birthDate;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      JodaBeansLightPerson other = (JodaBeansLightPerson) obj;
      return JodaBeanUtils.equal(name, other.name) &&
          JodaBeanUtils.equal(birthDate, other.birthDate);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(name);
    hash = hash * 31 + JodaBeanUtils.hashCode(birthDate);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("JodaBeansLightPerson{");
    buf.append("name").append('=').append(name).append(',').append(' ');
    buf.append("birthDate").append('=').append(JodaBeanUtils.toString(birthDate));
    buf.append('}');
    return buf.toString();
  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}