
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for livro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="livro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livro", propOrder = {
    "ano",
    "autorPrincipal",
    "editora",
    "id",
    "isbn",
    "titulo"
})
public class Livro {

    protected String ano;
    protected String autorPrincipal;
    protected String editora;
    protected int id;
    protected String isbn;
    protected String titulo;

    /**
     * Gets the value of the ano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAno() {
        return ano;
    }

    /**
     * Sets the value of the ano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAno(String value) {
        this.ano = value;
    }

    /**
     * Gets the value of the autorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    /**
     * Sets the value of the autorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorPrincipal(String value) {
        this.autorPrincipal = value;
    }

    /**
     * Gets the value of the editora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Sets the value of the editora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditora(String value) {
        this.editora = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
