package product;

/**
 * <p> This interface constains all common application utility constants.</p>
 *
 * @author Santosh Kumar
 */
public interface ProductConstants
{
    //~ Static variables -------------------------------------------------------

    static final String appName = "";
    static final String upcNumber = "";
    static final String EBAY_DEV_API_LINK =
        "http://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByProduct&X-EBAY-SOA-SECURITY-APPNAME=" +
          appName +
          "&RESPONSE-DATA-FORMAT=XML&REST-PAYLOAD&productId.@type=UPC&productId=";
    static final String EBAY_DEV_API_LINK_FILTER =
        "&sortOrder=PricePlusShippingLowest&paginationInput.entriesPerPage=100&GLOBAL-ID=EBAY-US";
}
