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

package com.liferay.ams.model.impl;

import com.liferay.ams.model.Type;
import com.liferay.ams.model.TypeModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the Type service. Represents a row in the &quot;AMS_Type&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.ams.model.TypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeImpl
 * @see com.liferay.ams.model.Type
 * @see com.liferay.ams.model.TypeModel
 * @generated
 */
public class TypeModelImpl extends BaseModelImpl<Type> implements TypeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a type model instance should use the {@link com.liferay.ams.model.Type} interface instead.
	 */
	public static final String TABLE_NAME = "AMS_Type";
	public static final Object[][] TABLE_COLUMNS = {
			{ "typeId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table AMS_Type (typeId LONG not null primary key,groupId LONG,name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table AMS_Type";
	public static final String ORDER_BY_JPQL = " ORDER BY type.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AMS_Type.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.ams.model.Type"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.ams.model.Type"),
			true);

	public Class<?> getModelClass() {
		return Type.class;
	}

	public String getModelClassName() {
		return Type.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.ams.model.Type"));

	public TypeModelImpl() {
	}

	public long getPrimaryKey() {
		return _typeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setTypeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_typeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	@Override
	public Type toEscapedModel() {
		if (isEscapedModel()) {
			return (Type)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (Type)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Type.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TypeImpl typeImpl = new TypeImpl();

		typeImpl.setTypeId(getTypeId());
		typeImpl.setGroupId(getGroupId());
		typeImpl.setName(getName());

		typeImpl.resetOriginalValues();

		return typeImpl;
	}

	public int compareTo(Type type) {
		int value = 0;

		value = getName().compareTo(type.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Type type = null;

		try {
			type = (Type)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = type.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{typeId=");
		sb.append(getTypeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.ams.model.Type");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Type.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Type.class
		};
	private long _typeId;
	private long _groupId;
	private String _name;
	private transient ExpandoBridge _expandoBridge;
	private Type _escapedModelProxy;
}