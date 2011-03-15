/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.microblogs.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MicroblogsEntry service. Represents a row in the &quot;MicroblogsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.microblogs.model.impl.MicroblogsEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.microblogs.model.impl.MicroblogsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MicroblogsEntry
 * @see com.liferay.microblogs.model.impl.MicroblogsEntryImpl
 * @see com.liferay.microblogs.model.impl.MicroblogsEntryModelImpl
 * @generated
 */
public interface MicroblogsEntryModel extends BaseModel<MicroblogsEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a microblogs entry model instance should use the {@link MicroblogsEntry} interface instead.
	 */

	/**
	 * Gets the primary key of this microblogs entry.
	 *
	 * @return the primary key of this microblogs entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this microblogs entry
	 *
	 * @param pk the primary key of this microblogs entry
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the microblogs entry ID of this microblogs entry.
	 *
	 * @return the microblogs entry ID of this microblogs entry
	 */
	public long getMicroblogsEntryId();

	/**
	 * Sets the microblogs entry ID of this microblogs entry.
	 *
	 * @param microblogsEntryId the microblogs entry ID of this microblogs entry
	 */
	public void setMicroblogsEntryId(long microblogsEntryId);

	/**
	 * Gets the company ID of this microblogs entry.
	 *
	 * @return the company ID of this microblogs entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this microblogs entry.
	 *
	 * @param companyId the company ID of this microblogs entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this microblogs entry.
	 *
	 * @return the user ID of this microblogs entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this microblogs entry.
	 *
	 * @param userId the user ID of this microblogs entry
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this microblogs entry.
	 *
	 * @return the user uuid of this microblogs entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this microblogs entry.
	 *
	 * @param userUuid the user uuid of this microblogs entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this microblogs entry.
	 *
	 * @return the user name of this microblogs entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this microblogs entry.
	 *
	 * @param userName the user name of this microblogs entry
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this microblogs entry.
	 *
	 * @return the create date of this microblogs entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this microblogs entry.
	 *
	 * @param createDate the create date of this microblogs entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this microblogs entry.
	 *
	 * @return the modified date of this microblogs entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this microblogs entry.
	 *
	 * @param modifiedDate the modified date of this microblogs entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the content of this microblogs entry.
	 *
	 * @return the content of this microblogs entry
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this microblogs entry.
	 *
	 * @param content the content of this microblogs entry
	 */
	public void setContent(String content);

	/**
	 * Gets the type of this microblogs entry.
	 *
	 * @return the type of this microblogs entry
	 */
	public int getType();

	/**
	 * Sets the type of this microblogs entry.
	 *
	 * @param type the type of this microblogs entry
	 */
	public void setType(int type);

	/**
	 * Gets the receiver user ID of this microblogs entry.
	 *
	 * @return the receiver user ID of this microblogs entry
	 */
	public long getReceiverUserId();

	/**
	 * Sets the receiver user ID of this microblogs entry.
	 *
	 * @param receiverUserId the receiver user ID of this microblogs entry
	 */
	public void setReceiverUserId(long receiverUserId);

	/**
	 * Gets the receiver user uuid of this microblogs entry.
	 *
	 * @return the receiver user uuid of this microblogs entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getReceiverUserUuid() throws SystemException;

	/**
	 * Sets the receiver user uuid of this microblogs entry.
	 *
	 * @param receiverUserUuid the receiver user uuid of this microblogs entry
	 */
	public void setReceiverUserUuid(String receiverUserUuid);

	/**
	 * Gets the receiver microblogs entry ID of this microblogs entry.
	 *
	 * @return the receiver microblogs entry ID of this microblogs entry
	 */
	public long getReceiverMicroblogsEntryId();

	/**
	 * Sets the receiver microblogs entry ID of this microblogs entry.
	 *
	 * @param receiverMicroblogsEntryId the receiver microblogs entry ID of this microblogs entry
	 */
	public void setReceiverMicroblogsEntryId(long receiverMicroblogsEntryId);

	/**
	 * Gets the social relation type of this microblogs entry.
	 *
	 * @return the social relation type of this microblogs entry
	 */
	public int getSocialRelationType();

	/**
	 * Sets the social relation type of this microblogs entry.
	 *
	 * @param socialRelationType the social relation type of this microblogs entry
	 */
	public void setSocialRelationType(int socialRelationType);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(MicroblogsEntry microblogsEntry);

	public int hashCode();

	public MicroblogsEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}