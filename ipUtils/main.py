#! /usr/bin/python2.7

from ipUtil import *
from multIpUtil import *

iplist = ['127.0.0.1', '192.168.1.83', '192.168.1.44']

ip = multIpUtil(iplist)
print ip.multStatus()
