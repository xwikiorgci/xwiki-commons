/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.extension.internal.converter;

import java.lang.reflect.Type;

import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.extension.version.Version;
import org.xwiki.extension.version.internal.DefaultVersion;
import org.xwiki.properties.converter.AbstractConverter;

/**
 * Convert a version from a String to a {@link Version} object and the other way around.
 * 
 * @version $Id$
 * @since 12.10
 */
@Component
@Singleton
public class VersionConverter extends AbstractConverter<Version>
{
    @Override
    protected Version convertToType(Type targetType, Object value)
    {
        if (value == null) {
            return null;
        }

        return new DefaultVersion(value.toString());
    }
}
