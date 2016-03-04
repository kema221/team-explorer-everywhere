// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._BuildServiceSoap_QueryProcessTemplates;
import ms.tfs.build.buildservice._04._ProcessTemplateType;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceSoap_QueryProcessTemplates
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String teamProject;
    protected _ProcessTemplateType[] queryTypes;

    public _BuildServiceSoap_QueryProcessTemplates()
    {
        super();
    }

    public _BuildServiceSoap_QueryProcessTemplates(
        final String teamProject,
        final _ProcessTemplateType[] queryTypes)
    {
        // TODO : Call super() instead of setting all fields directly?
        setTeamProject(teamProject);
        setQueryTypes(queryTypes);
    }

    public String getTeamProject()
    {
        return this.teamProject;
    }

    public void setTeamProject(String value)
    {
        this.teamProject = value;
    }

    public _ProcessTemplateType[] getQueryTypes()
    {
        return this.queryTypes;
    }

    public void setQueryTypes(_ProcessTemplateType[] value)
    {
        this.queryTypes = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "teamProject",
            this.teamProject);

        if (this.queryTypes != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("queryTypes");

            for (int iterator0 = 0; iterator0 < this.queryTypes.length; iterator0++)
            {
                this.queryTypes[iterator0].writeAsElement(
                    writer,
                    "ProcessTemplateType");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}