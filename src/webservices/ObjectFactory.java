
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _BuscarResponse_QNAME = new QName("http://service.biblioteca/", "buscarResponse");
    private final static QName _Buscar_QNAME = new QName("http://service.biblioteca/", "buscar");
    private final static QName _Obter_QNAME = new QName("http://service.biblioteca/", "obter");
    private final static QName _ObterResponse_QNAME = new QName("http://service.biblioteca/", "obterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link Obter }
     * 
     */
    public Obter createObter() {
        return new Obter();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link ObterResponse }
     * 
     */
    public ObterResponse createObterResponse() {
        return new ObterResponse();
    }

    /**
     * Create an instance of {@link Livro }
     * 
     */
    public Livro createLivro() {
        return new Livro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca/", name = "buscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca/", name = "buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca/", name = "obter")
    public JAXBElement<Obter> createObter(Obter value) {
        return new JAXBElement<Obter>(_Obter_QNAME, Obter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblioteca/", name = "obterResponse")
    public JAXBElement<ObterResponse> createObterResponse(ObterResponse value) {
        return new JAXBElement<ObterResponse>(_ObterResponse_QNAME, ObterResponse.class, null, value);
    }

}
