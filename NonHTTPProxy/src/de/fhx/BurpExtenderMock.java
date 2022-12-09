package de.fhx;

import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

import burp.IBurpCollaboratorClientContext;
import burp.IBurpExtenderCallbacks;
import burp.IContextMenuFactory;
import burp.ICookie;
import burp.IExtensionHelpers;
import burp.IExtensionStateListener;
import burp.IHttpListener;
import burp.IHttpRequestResponse;
import burp.IHttpRequestResponsePersisted;
import burp.IHttpRequestResponseWithMarkers;
import burp.IHttpService;
import burp.IIntruderPayloadGeneratorFactory;
import burp.IIntruderPayloadProcessor;
import burp.IMenuItemHandler;
import burp.IMessageEditor;
import burp.IMessageEditorController;
import burp.IMessageEditorTabFactory;
import burp.IProxyListener;
import burp.IScanIssue;
import burp.IScanQueueItem;
import burp.IScannerCheck;
import burp.IScannerInsertionPointProvider;
import burp.IScannerListener;
import burp.IScopeChangeListener;
import burp.ISessionHandlingAction;
import burp.ITab;
import burp.ITempFile;
import burp.ITextEditor;

public class BurpExtenderMock implements IBurpExtenderCallbacks {

	@Override
	public void setExtensionName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IExtensionHelpers getHelpers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputStream getStdout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputStream getStderr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printOutput(String output) {
		System.out.println(output);
		
	}

	@Override
	public void printError(String error) {
		System.out.println(error);
		
	}

	@Override
	public void registerExtensionStateListener(IExtensionStateListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IExtensionStateListener> getExtensionStateListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeExtensionStateListener(IExtensionStateListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerHttpListener(IHttpListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IHttpListener> getHttpListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeHttpListener(IHttpListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerProxyListener(IProxyListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IProxyListener> getProxyListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProxyListener(IProxyListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerScannerListener(IScannerListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IScannerListener> getScannerListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeScannerListener(IScannerListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerScopeChangeListener(IScopeChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IScopeChangeListener> getScopeChangeListeners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeScopeChangeListener(IScopeChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerContextMenuFactory(IContextMenuFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IContextMenuFactory> getContextMenuFactories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeContextMenuFactory(IContextMenuFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerMessageEditorTabFactory(IMessageEditorTabFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMessageEditorTabFactory(IMessageEditorTabFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerScannerCheck(IScannerCheck check) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IScannerCheck> getScannerChecks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeScannerCheck(IScannerCheck check) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory factory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor processor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor processor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerSessionHandlingAction(ISessionHandlingAction action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ISessionHandlingAction> getSessionHandlingActions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeSessionHandlingAction(ISessionHandlingAction action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unloadExtension() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSuiteTab(ITab tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSuiteTab(ITab tab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customizeUiComponent(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IMessageEditor createMessageEditor(IMessageEditorController controller, boolean editable) {
		return new MessageEditor();
	}

	@Override
	public String[] getCommandLineArguments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveExtensionSetting(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String loadExtensionSetting(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITextEditor createTextEditor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendToRepeater(String host, int port, boolean useHttps, byte[] request, String tabCaption) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendToIntruder(String host, int port, boolean useHttps, byte[] request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendToIntruder(String host, int port, boolean useHttps, byte[] request,
			List<int[]> payloadPositionOffsets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendToComparer(byte[] data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendToSpider(URL url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IScanQueueItem doActiveScan(String host, int port, boolean useHttps, byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IScanQueueItem doActiveScan(String host, int port, boolean useHttps, byte[] request,
			List<int[]> insertionPointOffsets) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doPassiveScan(String host, int port, boolean useHttps, byte[] request, byte[] response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IHttpRequestResponse makeHttpRequest(IHttpService httpService, byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] makeHttpRequest(String host, int port, boolean useHttps, byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInScope(URL url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void includeInScope(URL url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excludeFromScope(URL url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void issueAlert(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IHttpRequestResponse[] getProxyHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpRequestResponse[] getSiteMap(String urlPrefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IScanIssue[] getScanIssues(String urlPrefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateScanReport(String format, IScanIssue[] issues, File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ICookie> getCookieJarContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCookieJar(ICookie cookie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToSiteMap(IHttpRequestResponse item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreState(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveState(File file) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, String> saveConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadConfig(Map<String, String> config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String saveConfigAsJson(String... configPaths) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadConfigFromJson(String config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProxyInterceptionEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getBurpVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExtensionFilename() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExtensionBapp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void exitSuite(boolean promptUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITempFile saveToTempFile(byte[] buffer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse httpRequestResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse httpRequestResponse,
			List<int[]> requestMarkers, List<int[]> responseMarkers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolName(int toolFlag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addScanIssue(IScanIssue issue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[][] getParameters(byte[] request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getHeaders(byte[] message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerMenuItem(String menuItemCaption, IMenuItemHandler menuItemHandler) {
		// TODO Auto-generated method stub
		
	}

}
