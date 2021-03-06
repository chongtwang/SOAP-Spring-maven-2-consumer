//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.19 at 10:04:12 AM EDT 
//


package spring.exigen.auto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exigen.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DriverRisk_QNAME = new QName("http://demo.rules.openl.org/", "DriverRisk");
    private final static QName _DriverRiskResponse_QNAME = new QName("http://demo.rules.openl.org/", "DriverRiskResponse");
    private final static QName _DriverAgeType_QNAME = new QName("http://demo.rules.openl.org/", "DriverAgeType");
    private final static QName _DriverAgeTypeResponse_QNAME = new QName("http://demo.rules.openl.org/", "DriverAgeTypeResponse");
    private final static QName _AccidentPremium_QNAME = new QName("http://demo.rules.openl.org/", "AccidentPremium");
    private final static QName _AccidentPremiumResponse_QNAME = new QName("http://demo.rules.openl.org/", "AccidentPremiumResponse");
    private final static QName _AccidentPremiumResponseReturn_QNAME = new QName("http://demo.rules.openl.org/", "return");
    private final static QName _DriverAgeTypeArg0_QNAME = new QName("http://demo.rules.openl.org/", "arg0");
    private final static QName _DriverAgeTypeArg1_QNAME = new QName("http://demo.rules.openl.org/", "arg1");
    private final static QName _DriverRiskArg2_QNAME = new QName("http://demo.rules.openl.org/", "arg2");
    private final static QName _SpreadsheetResultColumnNames_QNAME = new QName("http://calc.rules.openl.org", "columnNames");
    private final static QName _SpreadsheetResultFieldsCoordinates_QNAME = new QName("http://calc.rules.openl.org", "fieldsCoordinates");
    private final static QName _SpreadsheetResultResults_QNAME = new QName("http://calc.rules.openl.org", "results");
    private final static QName _SpreadsheetResultRowNames_QNAME = new QName("http://calc.rules.openl.org", "rowNames");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exigen.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link String2PointMap }
     * 
     */
    public String2PointMap createString2PointMap() {
        return new String2PointMap();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfAnyType }
     * 
     */
    public ArrayOfArrayOfAnyType createArrayOfArrayOfAnyType() {
        return new ArrayOfArrayOfAnyType();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link SpreadsheetResult }
     * 
     */
    public SpreadsheetResult createSpreadsheetResult() {
        return new SpreadsheetResult();
    }

    /**
     * Create an instance of {@link DriverRisk }
     * 
     */
    public DriverRisk createDriverRisk() {
        return new DriverRisk();
    }

    /**
     * Create an instance of {@link DriverRiskResponse }
     * 
     */
    public DriverRiskResponse createDriverRiskResponse() {
        return new DriverRiskResponse();
    }

    /**
     * Create an instance of {@link DriverAgeType }
     * 
     */
    public DriverAgeType createDriverAgeType() {
        return new DriverAgeType();
    }

    /**
     * Create an instance of {@link DriverAgeTypeResponse }
     * 
     */
    public DriverAgeTypeResponse createDriverAgeTypeResponse() {
        return new DriverAgeTypeResponse();
    }

    /**
     * Create an instance of {@link AccidentPremium }
     * 
     */
    public AccidentPremium createAccidentPremium() {
        return new AccidentPremium();
    }

    /**
     * Create an instance of {@link AccidentPremiumResponse }
     * 
     */
    public AccidentPremiumResponse createAccidentPremiumResponse() {
        return new AccidentPremiumResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link String2PointMap.Entry }
     * 
     */
    public String2PointMap.Entry createString2PointMapEntry() {
        return new String2PointMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverRisk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "DriverRisk")
    public JAXBElement<DriverRisk> createDriverRisk(DriverRisk value) {
        return new JAXBElement<DriverRisk>(_DriverRisk_QNAME, DriverRisk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverRiskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "DriverRiskResponse")
    public JAXBElement<DriverRiskResponse> createDriverRiskResponse(DriverRiskResponse value) {
        return new JAXBElement<DriverRiskResponse>(_DriverRiskResponse_QNAME, DriverRiskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverAgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "DriverAgeType")
    public JAXBElement<DriverAgeType> createDriverAgeType(DriverAgeType value) {
        return new JAXBElement<DriverAgeType>(_DriverAgeType_QNAME, DriverAgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverAgeTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "DriverAgeTypeResponse")
    public JAXBElement<DriverAgeTypeResponse> createDriverAgeTypeResponse(DriverAgeTypeResponse value) {
        return new JAXBElement<DriverAgeTypeResponse>(_DriverAgeTypeResponse_QNAME, DriverAgeTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccidentPremium }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "AccidentPremium")
    public JAXBElement<AccidentPremium> createAccidentPremium(AccidentPremium value) {
        return new JAXBElement<AccidentPremium>(_AccidentPremium_QNAME, AccidentPremium.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccidentPremiumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "AccidentPremiumResponse")
    public JAXBElement<AccidentPremiumResponse> createAccidentPremiumResponse(AccidentPremiumResponse value) {
        return new JAXBElement<AccidentPremiumResponse>(_AccidentPremiumResponse_QNAME, AccidentPremiumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "return", scope = AccidentPremiumResponse.class)
    public JAXBElement<Double> createAccidentPremiumResponseReturn(Double value) {
        return new JAXBElement<Double>(_AccidentPremiumResponseReturn_QNAME, Double.class, AccidentPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "return", scope = DriverAgeTypeResponse.class)
    public JAXBElement<String> createDriverAgeTypeResponseReturn(String value) {
        return new JAXBElement<String>(_AccidentPremiumResponseReturn_QNAME, String.class, DriverAgeTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "arg0", scope = DriverAgeType.class)
    public JAXBElement<String> createDriverAgeTypeArg0(String value) {
        return new JAXBElement<String>(_DriverAgeTypeArg0_QNAME, String.class, DriverAgeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "arg1", scope = DriverAgeType.class)
    public JAXBElement<Integer> createDriverAgeTypeArg1(Integer value) {
        return new JAXBElement<Integer>(_DriverAgeTypeArg1_QNAME, Integer.class, DriverAgeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "return", scope = DriverRiskResponse.class)
    public JAXBElement<String> createDriverRiskResponseReturn(String value) {
        return new JAXBElement<String>(_AccidentPremiumResponseReturn_QNAME, String.class, DriverRiskResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "arg0", scope = DriverRisk.class)
    public JAXBElement<Integer> createDriverRiskArg0(Integer value) {
        return new JAXBElement<Integer>(_DriverAgeTypeArg0_QNAME, Integer.class, DriverRisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "arg1", scope = DriverRisk.class)
    public JAXBElement<Integer> createDriverRiskArg1(Integer value) {
        return new JAXBElement<Integer>(_DriverAgeTypeArg1_QNAME, Integer.class, DriverRisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.rules.openl.org/", name = "arg2", scope = DriverRisk.class)
    public JAXBElement<Integer> createDriverRiskArg2(Integer value) {
        return new JAXBElement<Integer>(_DriverRiskArg2_QNAME, Integer.class, DriverRisk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.rules.openl.org", name = "columnNames", scope = SpreadsheetResult.class)
    public JAXBElement<ArrayOfString> createSpreadsheetResultColumnNames(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_SpreadsheetResultColumnNames_QNAME, ArrayOfString.class, SpreadsheetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String2PointMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.rules.openl.org", name = "fieldsCoordinates", scope = SpreadsheetResult.class)
    public JAXBElement<String2PointMap> createSpreadsheetResultFieldsCoordinates(String2PointMap value) {
        return new JAXBElement<String2PointMap>(_SpreadsheetResultFieldsCoordinates_QNAME, String2PointMap.class, SpreadsheetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfAnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.rules.openl.org", name = "results", scope = SpreadsheetResult.class)
    public JAXBElement<ArrayOfArrayOfAnyType> createSpreadsheetResultResults(ArrayOfArrayOfAnyType value) {
        return new JAXBElement<ArrayOfArrayOfAnyType>(_SpreadsheetResultResults_QNAME, ArrayOfArrayOfAnyType.class, SpreadsheetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.rules.openl.org", name = "rowNames", scope = SpreadsheetResult.class)
    public JAXBElement<ArrayOfString> createSpreadsheetResultRowNames(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_SpreadsheetResultRowNames_QNAME, ArrayOfString.class, SpreadsheetResult.class, value);
    }

}
