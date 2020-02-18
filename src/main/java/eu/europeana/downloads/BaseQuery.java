package eu.europeana.downloads;

import static eu.europeana.downloads.OAIPMHQuery.VERB_PARAMETER;

public class BaseQuery {
    static final String METADATA_PREFIX_PARAMETER = "&metadataPrefix=%s";

    static final String FROM_PARAMETER = "&from=%s";

    static final String UNTIL_PARAMETER = "&until=%s";

    static final String SET_PARAMETER = "&set=%s";

    static final String RESUMPTION_TOKEN_PARAMETER = "&resumptionToken=%s";

    static final String IDENTIFIER_PARAMETER = "&identifier=%s";

    String getBaseRequest(String oaipmhServer, String verbName) {
        return oaipmhServer +
                "?" +
                String.format(VERB_PARAMETER, verbName);
    }
}
