package nro;

public interface IMessageHandler {

   void onMessage(Message message);

   void onConnectionFail(boolean isMain);

   void onDisconnected(boolean isMain);

   void onConnectOK(boolean isMain);
}
