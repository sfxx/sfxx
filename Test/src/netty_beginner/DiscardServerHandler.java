package netty_beginner;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

/**
 * ����˴���ͨ��.����ֻ�Ǵ�ӡһ����������ݣ���������������κε���Ӧ DiscardServerHandler �̳���
 * ChannelHandlerAdapter�� �����ʵ����ChannelHandler�ӿڣ� ChannelHandler�ṩ������¼�����Ľӿڷ�����
 * Ȼ������Ը�����Щ������ ���ڽ���ֻ��Ҫ�̳�ChannelHandlerAdapter����������Լ�ȥʵ�ֽӿڷ�����
 *
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
    /**
     * �������Ǹ�����chanelRead()�¼��������� ÿ���ӿͻ����յ��µ�����ʱ�� ������������յ���Ϣʱ�����ã�
     * ��������У��յ�����Ϣ��������ByteBuf
     * 
     * @param ctx
     *            ͨ���������������Ϣ
     * @param msg
     *            ���յ���Ϣ
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        try {
            ByteBuf in = (ByteBuf) msg;
            // ��ӡ�ͻ������룬��������ĵ��ַ�
            System.out.print(in.toString(CharsetUtil.UTF_8));
        } finally {
            /**
             * ByteBuf��һ�����ü�������������������ʾ�ص���release()�������ͷš�
             * ���ס��������ְ�����ͷ����д��ݵ������������ü�������
             */
            // �����յ�������
            ReferenceCountUtil.release(msg);
        }

    }

    /***
     * ����������ڷ����쳣ʱ����
     * 
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        /**
         * exceptionCaught() �¼��������ǵ����� Throwable ����Żᱻ���ã����� Netty ���� IO
         * ������ߴ������ڴ����¼�ʱ�׳����쳣ʱ���ڴ󲿷�����£�������쳣Ӧ�ñ���¼���� ���Ұѹ����� channel
         * ���رյ���Ȼ����������Ĵ���ʽ����������ͬ�쳣��������в� ͬ��ʵ�֣�������������ڹر�����֮ǰ����һ�����������Ӧ��Ϣ��
         */
        // �����쳣�͹ر�
        cause.printStackTrace();
        ctx.close();
    }

}