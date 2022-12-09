package de.fhx;

import java.net.URL;
import java.util.List;

import burp.IExtensionHelpers;
import burp.IHttpRequestResponse;
import burp.IHttpService;
import burp.IParameter;
import burp.IRequestInfo;
import burp.IResponseInfo;
import burp.IResponseKeywords;
import burp.IResponseVariations;
import burp.IScannerInsertionPoint;

public class BurpExtensionHelpersMock implements IExtensionHelpers {

	@Override
	public IRequestInfo analyzeRequest(IHttpRequestResponse request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRequestInfo analyzeRequest(IHttpService httpService, byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRequestInfo analyzeRequest(byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResponseInfo analyzeResponse(byte[] response) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IParameter getRequestParameter(byte[] request, String parameterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String urlDecode(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String urlEncode(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] urlDecode(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] urlEncode(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] base64Decode(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] base64Decode(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String base64Encode(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String base64Encode(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] stringToBytes(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bytesToString(byte[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(byte[] data, byte[] pattern, boolean caseSensitive, int from, int to) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] buildHttpMessage(List<String> headers, byte[] body) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] buildHttpRequest(URL url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] addParameter(byte[] request, IParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] removeParameter(byte[] request, IParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] updateParameter(byte[] request, IParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] toggleRequestMethod(byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpService buildHttpService(String host, int port, String protocol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpService buildHttpService(String host, int port, boolean useHttps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IParameter buildParameter(String name, String value, byte type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IScannerInsertionPoint makeScannerInsertionPoint(String insertionPointName, byte[] baseRequest, int from,
			int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResponseVariations analyzeResponseVariations(byte[]... responses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResponseKeywords analyzeResponseKeywords(List<String> keywords, byte[]... responses) {
		// TODO Auto-generated method stub
		return null;
	}

}
