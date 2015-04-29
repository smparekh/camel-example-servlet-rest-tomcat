/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.examples.rest;

public class Provider {
    
	private int id;
	private String firstName;
    private String lastName;
    private String mobilePhone;
    private String mailingAddress;
    private String zipCode;
   
    
    // Dummy constructor needed for rest invocation
    public Provider() {
    	
    }
    
    public Provider(int id, String firstName, String lastName, String mobilePhone,
			String mailingAddress, String zipCode) {
    	this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobilePhone = mobilePhone;
		this.mailingAddress = mailingAddress;
		this.zipCode = zipCode;
	}
    
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	public String getMailingAddress() {
		return mailingAddress;
	}
	
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}