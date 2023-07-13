public class OnlineAttentionFacadeImpl implements AttentionFacade {

		Mobile mobile = new Mobile();
		Phone phone = new Phone();
		Web web = new Web();

	public String attendRequestMobile() {
		return mobile.attendRequest();
	}
	public String attendRequestPhone() {
		return phone.attendRequest();
	}
	public String attendRequestWeb() {
		return web.attendRequest();
	}
	@Override
	public String attendRequest() {
		return "Requires Presencial Request";
	}
}