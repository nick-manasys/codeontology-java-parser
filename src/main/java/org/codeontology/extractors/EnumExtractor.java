package org.codeontology.extractors;


import org.codeontology.Ontology;
import com.hp.hpl.jena.rdf.model.RDFNode;
import spoon.reflect.reference.CtTypeReference;

public class EnumExtractor<T extends Enum<?>> extends ClassExtractor<T> {

    public EnumExtractor(CtTypeReference<?> reference) {
        super(reference);
    }

    @Override
    protected RDFNode getType() {
        return Ontology.getEnumIndividual();
    }
}