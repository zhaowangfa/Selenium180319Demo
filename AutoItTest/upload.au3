;ControlFocus("title","text",controlID) Edit1=Edit instance 1
ControlFocus("�ļ��ϴ�", "","Edit1")

; Wait 10 seconds for the Upload window to appear
WinWait("[CLASS:#32770]","",10)

; Set the File name text on the Edit field
ControlSetText("�ļ��ϴ�", "", "Edit1", "D:\testing\LoadRunner.pdf")
Sleep(2000)

; Click on the Open button
ControlClick("�ļ��ϴ�", "","Button1");