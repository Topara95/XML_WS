package rs.ftn.poslovna.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import rs.ftn.poslovna.domain.AnalitikaIzvoda;

public class AnalitikaDto {

	// nece unositi
	private int id;

	@NotNull
	@Size(max = 256)
	private String duznikNalogodavac;

	@NotNull
	@Size(max = 256)
	private String svrhaPlacanja;

	@NotNull
	@Size(max = 256)
	private String poverilacPrimalac;

	// nece unositi
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd")
	private Date datumPrijema;

	// nece unositi
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd")
	private Date datumValute;

	@NotBlank
	@Size(min = 18, max = 18)
	private String racunDuznika;

	@NotNull
	@Digits(integer = 2, fraction = 0)
	private BigDecimal modelZaduzenja;

	@NotBlank
	@Size(max = 20)
	private String pozivNaBrojZaduzenja;

	@NotBlank
	@Size(min = 18, max = 18)
	private String racunPoverioca;

	@NotNull
	@Digits(integer = 2, fraction = 0)
	private BigDecimal modelOdobrenja;

	@NotBlank
	@Size(max = 20)
	private String pozivNaBrojOdobrenja;

	private boolean hitno;

	@NotNull
	@Digits(integer = 15, fraction = 2)
	private BigDecimal iznos;

	private int tipGreske;

	private String status;

	private Integer valutaId;

	private Integer naseljenoMestoId;

	@Digits(integer = 3, fraction = 0)
	private Short vrstaPlacanjaId;

	private long dnevnoStanjeId;

	public AnalitikaDto() {

	}

	public AnalitikaDto(AnalitikaIzvoda analitika) {
		// dopuni...
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDuznikNalogodavac() {
		return duznikNalogodavac;
	}

	public void setDuznikNalogodavac(String duznikNalogodavac) {
		this.duznikNalogodavac = duznikNalogodavac;
	}

	public String getSvrhaPlacanja() {
		return svrhaPlacanja;
	}

	public void setSvrhaPlacanja(String svrhaPlacanja) {
		this.svrhaPlacanja = svrhaPlacanja;
	}

	public String getPoverilacPrimalac() {
		return poverilacPrimalac;
	}

	public void setPoverilacPrimalac(String poverilacPrimalac) {
		this.poverilacPrimalac = poverilacPrimalac;
	}

	public Date getDatumPrijema() {
		return datumPrijema;
	}

	public void setDatumPrijema(Date datumPrijema) {
		this.datumPrijema = datumPrijema;
	}

	public Date getDatumValute() {
		return datumValute;
	}

	public void setDatumValute(Date datumValute) {
		this.datumValute = datumValute;
	}

	public String getRacunDuznika() {
		return racunDuznika;
	}

	public void setRacunDuznika(String racunDuznika) {
		this.racunDuznika = racunDuznika;
	}

	public BigDecimal getModelZaduzenja() {
		return modelZaduzenja;
	}

	public void setModelZaduzenja(BigDecimal modelZaduzenja) {
		this.modelZaduzenja = modelZaduzenja;
	}

	public String getPozivNaBrojZaduzenja() {
		return pozivNaBrojZaduzenja;
	}

	public void setPozivNaBrojZaduzenja(String pozivNaBrojZaduzenja) {
		this.pozivNaBrojZaduzenja = pozivNaBrojZaduzenja;
	}

	public String getRacunPoverioca() {
		return racunPoverioca;
	}

	public void setRacunPoverioca(String racunPoverioca) {
		this.racunPoverioca = racunPoverioca;
	}

	public BigDecimal getModelOdobrenja() {
		return modelOdobrenja;
	}

	public void setModelOdobrenja(BigDecimal modelOdobrenja) {
		this.modelOdobrenja = modelOdobrenja;
	}

	public String getPozivNaBrojOdobrenja() {
		return pozivNaBrojOdobrenja;
	}

	public void setPozivNaBrojOdobrenja(String pozivNaBrojOdobrenja) {
		this.pozivNaBrojOdobrenja = pozivNaBrojOdobrenja;
	}

	public boolean isHitno() {
		return hitno;
	}

	public void setHitno(boolean hitno) {
		this.hitno = hitno;
	}

	public BigDecimal getIznos() {
		return iznos;
	}

	public void setIznos(BigDecimal iznos) {
		this.iznos = iznos;
	}

	public int getTipGreske() {
		return tipGreske;
	}

	public void setTipGreske(int tipGreske) {
		this.tipGreske = tipGreske;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getValutaId() {
		return valutaId;
	}

	public void setValutaId(Integer valutaId) {
		this.valutaId = valutaId;
	}

	public short getVrstaPlacanjaId() {
		return vrstaPlacanjaId;
	}

	public void setVrstaPlacanjaId(short vrstaPlacanjaId) {
		this.vrstaPlacanjaId = vrstaPlacanjaId;
	}

	public long getDnevnoStanjeId() {
		return dnevnoStanjeId;
	}

	public void setDnevnoStanjeId(long dnevnoStanjeId) {
		this.dnevnoStanjeId = dnevnoStanjeId;
	}

	public Integer getNaseljenoMestoId() {
		return naseljenoMestoId;
	}

	public void setNaseljenoMestoId(Integer naseljenoMestoId) {
		this.naseljenoMestoId = naseljenoMestoId;
	}

}
