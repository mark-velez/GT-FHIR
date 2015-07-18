/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import edu.gatech.i3l.jpa.model.omop.ext.VisitOccurrenceFhirExtTable;

/**
 * @author Myung Choi
 *
 */
@Transactional(propagation = Propagation.REQUIRED)
public class EncounterFhirResourceDao extends BaseFhirResourceDao<Encounter> {

	
	public EncounterFhirResourceDao() {
		super();
		setResourceEntity(VisitOccurrenceFhirExtTable.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {
			
		};
	}
	

}
