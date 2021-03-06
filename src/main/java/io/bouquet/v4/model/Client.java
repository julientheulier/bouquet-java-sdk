/*******************************************************************************
 * Copyright 2017 julien@squidsolutions.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.bouquet.v4.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class Client extends Base   {

	private ClientPK id = null;
	private List<AccessRight> accessRights = new ArrayList<AccessRight>();
	private String secret = null;
	private List<String> urls = new ArrayList<String>();
	private String config = null;
	private String jwtkeyPublic = null;
	private String jwtkeyPrivate = null;
	private String oid = null;
	private String objectType = null;


	public enum RoleEnum {
		NONE("NONE"),
		READ("READ"),
		WRITE("WRITE"),
		OWNER("OWNER");

		private String value;

		RoleEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	private RoleEnum role = null;
	private String name = null;


	/**
	 * The object Composite Id (Primary Key)
	 **/
	public Client id(ClientPK id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(example = "null", value = "The object Composite Id (Primary Key)")
	public ClientPK getId() {
		return id;
	}
	public void setId(ClientPK id) {
		this.id = id;
	}


	/**
	 * The ACL for this object
	 **/
	public Client accessRights(List<AccessRight> accessRights) {
		this.accessRights = accessRights;
		return this;
	}

	@ApiModelProperty(example = "null", value = "The ACL for this object")
	public List<AccessRight> getAccessRights() {
		return accessRights;
	}
	public void setAccessRights(List<AccessRight> accessRights) {
		this.accessRights = accessRights;
	}


	/**
	 **/
	public Client secret(String secret) {
		this.secret = secret;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}


	/**
	 **/
	public Client urls(List<String> urls) {
		this.urls = urls;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public List<String> getUrls() {
		return urls;
	}
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}


	/**
	 **/
	public Client config(String config) {
		this.config = config;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}


	/**
	 **/
	public Client jwtkeyPublic(String jwtkeyPublic) {
		this.jwtkeyPublic = jwtkeyPublic;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public String getJwtkeyPublic() {
		return jwtkeyPublic;
	}
	public void setJwtkeyPublic(String jwtkeyPublic) {
		this.jwtkeyPublic = jwtkeyPublic;
	}


	/**
	 **/
	public Client jwtkeyPrivate(String jwtkeyPrivate) {
		this.jwtkeyPrivate = jwtkeyPrivate;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public String getJwtkeyPrivate() {
		return jwtkeyPrivate;
	}
	public void setJwtkeyPrivate(String jwtkeyPrivate) {
		this.jwtkeyPrivate = jwtkeyPrivate;
	}


	@ApiModelProperty(example = "null", value = "The Object Id")
	public String getOid() {
		return oid;
	}


	@ApiModelProperty(example = "null", value = "")
	public String getObjectType() {
		return objectType;
	}


	@ApiModelProperty(example = "null", value = "The role of the current User (passed in the context) over this object")
	public RoleEnum getRole() {
		return role;
	}


	/**
	 **/
	public Client name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(example = "null", value = "")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

