package br.com.javamagazine.springboot_test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Entity
public class FileSender {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="filename", length=25)
	private String fileName;
	
	@Lob
	@Column(name="text_file")
	private Byte[] textFile;
	
	@Lob
	@Column(name="image_file")
	private Byte[] imageFile;

	public FileSender() {
	}
	
	/**
	 * @param id
	 * @param fileName
	 * @param textFile
	 * @param imageFile
	 */
	public FileSender(Long id, String fileName, Byte[] textFile, Byte[] imageFile) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.textFile = textFile;
		this.imageFile = imageFile;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the textFile
	 */
	public Byte[] getTextFile() {
		return textFile;
	}

	/**
	 * @param textFile the textFile to set
	 */
	public void setTextFile(Byte[] textFile) {
		this.textFile = textFile;
	}

	/**
	 * @return the imageFile
	 */
	public Byte[] getImageFile() {
		return imageFile;
	}

	/**
	 * @param imageFile the imageFile to set
	 */
	public void setImageFile(Byte[] imageFile) {
		this.imageFile = imageFile;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
