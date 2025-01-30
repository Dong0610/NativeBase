
package com.dong.nativelibrary.svg;

import java.io.InputStream;

interface SVGParser
{
    SVGBase parseStream(InputStream is) throws SVGParseException;

    SVGParser setInternalEntitiesEnabled(boolean enable);

    SVGParser setExternalFileResolver(SVGExternalFileResolver fileResolver);
}