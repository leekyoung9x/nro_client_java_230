package nro;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import mod.Mod;

public final class Message {

    public byte command;
    private ByteArrayOutputStream baos = null;
    private DataOutputStream dos = null;
    private ByteArrayInputStream bais = null;
    private DataInputStream dis = null;

    public Message() {
    }

    public Message(byte cmd) {
        this.command = cmd;
        this.baos = new ByteArrayOutputStream(1024);
        this.dos = new DataOutputStream(this.baos);
    }

    public Message(byte cmd, byte[] data) {
        this.command = cmd;
        this.bais = new ByteArrayInputStream(data);
        this.dis = new DataInputStream(this.bais);
    }

    public final byte[] getData() {
        return this.baos.toByteArray();
    }

    public final int readInt3Byte() throws IOException {
        return this.dis.readInt();
    }
    public long readLong() throws IOException
	{
		if (Mod.isReadInt)
		{
            return this.dis.readInt();
        }

		return this.dis.readLong();
	}

    public final DataInputStream reader() {
        return this.dis;
    }

    public final DataOutputStream writer() {
        return this.dos;
    }

    public final void cleanup() {
        try {
            if (this.dis != null) {
                this.dis.close();
            }

            if (this.dos != null) {
                this.dos.close();
            }
        } catch (IOException var1) {
        }
    }
}
