/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.ecmascript.internal;

import org.mozilla.javascript.Context;

import net.sourceforge.pmd.processor.BatchLanguageProcessor;
import net.sourceforge.pmd.lang.LanguagePropertyBundle;
import net.sourceforge.pmd.lang.LanguageVersionHandler;
import net.sourceforge.pmd.lang.ast.Parser;
import net.sourceforge.pmd.lang.ecmascript.ast.EcmascriptParser;

public class EcmascriptProcessor extends BatchLanguageProcessor<LanguagePropertyBundle>
    implements LanguageVersionHandler {

    public EcmascriptProcessor(LanguagePropertyBundle properties) {
        super(properties);
    }

    public int getRhinoVersion() {
        return Context.VERSION_ES6;
    }

    @Override
    public Parser getParser() {
        return new EcmascriptParser(this);
    }

    @Override
    public LanguageVersionHandler services() {
        return this;
    }
}
